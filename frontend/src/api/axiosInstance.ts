import axios from 'axios';

// Use environment variable for API URL in production, fall back to relative path for Vite local proxying
const API = axios.create({ baseURL: import.meta.env.VITE_API_URL || '/' });

API.interceptors.request.use(cfg => {
  const token = localStorage.getItem('procurementToken');
  if (token) cfg.headers['Authorization'] = `Bearer ${token}`;
  return cfg;
});

API.interceptors.response.use(
  r => r,
  err => {
    const url = err.config?.url || '';
    const isAuthEndpoint = url.includes('/api/auth/') || url.includes('/api/vendor-auth/');
    // ✅ Only redirect to login on 401 for protected endpoints — NOT for the login endpoint itself
    // (wrong password returns 401, and without this check it causes a full page reload)
    if (err.response?.status === 401 && !isAuthEndpoint) {
      localStorage.removeItem('procurementToken');
      localStorage.removeItem('procurementRoles');
      localStorage.removeItem('procurementUser');
      localStorage.removeItem('procurementUserId');
      window.location.href = '/login';
    }
    return Promise.reject(err);
  }
);

export default API;
