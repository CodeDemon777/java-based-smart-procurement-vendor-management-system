# Smart Procurement & Vendor Management System

A modern, full-stack application designed to automate procurement operations, manage vendor onboarding, process purchase requisitions, and track order fulfillment. It provides separate portals and tools customized for Admins, Employees, Procurement Managers, and Vendors.

---

## 🚀 Key Features

* **Interactive Dashboards**: High-level metrics showing active vendors, pending requisitions, and purchase order fulfillment rates.
* **Employee Requisition Flow**: Employees can easily log in to submit itemized requisitions (e.g. equipment, software licenses).
* **Manager Review & Approvals**: Procurement Managers can inspect requisitions, approve/reject them, and generate corresponding Purchase Orders (PO).
* **Vendor Portal**:
  * Onboarding form for new vendors to submit business credentials.
  * Dedicated dashboard to review incoming POs.
  * Status updates (Approved ➜ Shipped ➜ Delivered) to notify procurement teams in real time.
* **Admin Control Center**:
  * Role management and approval dashboard for employee registration.
  * Approval workflow for pending vendor applications.
  * Comprehensive Audit Logs to track system activities.
* **Custom PDF & Excel Reports**: Tailored reports allowing users to download either the full summary, vendor directories, or purchase orders individually.

---

## 🛠 Tech Stack

### Frontend
* **Core**: React 18, Vite, TypeScript
* **Styling**: TailwindCSS, Vanilla CSS
* **Animations**: Framer Motion
* **Icons & Notifications**: Lucide React, Sonner Toast Notifications
* **Client Routing**: React Router DOM

### Backend
* **Core Framework**: Spring Boot 3.x
* **Security**: Spring Security, JWT (JSON Web Token) authentication
* **Database**: H2 In-Memory Database (MySQL compatibility mode enabled)
* **ORM**: Spring Data JPA / Hibernate
* **Reporting Utilities**: iText (for PDF reports) & Apache POI (for Excel sheets)

---

## 💻 Local Setup & Installation

Follow these steps to download, configure, and run the project locally on your PC or Laptop:

### Prerequisites
Make sure the following software is installed on your machine:
1. **Java JDK 21 or higher**
2. **Node.js** (v18.x or higher)
3. **Git**

---

### Step 1: Clone the Repository
Open a terminal (Command Prompt, PowerShell, or bash) and run:
```bash
git clone https://github.com/CodeDemon777/java-based-smart-procurement-vendor-management-system.git
cd java-based-smart-procurement-vendor-management-system
```

---

### Step 2: Set Up and Start the Backend
1. Navigate to the `backend/` directory:
   ```bash
   cd backend
   ```
2. Start the Spring Boot application using Maven:
   * **On Windows (PowerShell/CMD)**:
     ```powershell
     .\mvnw.cmd spring-boot:run
     ```
   * **On macOS / Linux**:
     ```bash
     chmod +x mvnw
     ./mvnw spring-boot:run
     ```
3. The backend will boot up on **`http://localhost:8082`**. 
4. The database is initialized automatically and seeded with a default Admin account:
   * **Username**: `admin`
   * **Password**: `admin123`

---

### Step 3: Set Up and Start the Frontend
1. Open a **new terminal window** at the project root directory (`java-based-smart-procurement-vendor-management-system`).
2. Navigate to the `frontend/` directory:
   ```bash
   cd frontend
   ```
3. Install the required Node packages:
   ```bash
   npm install
   ```
4. Start the development server:
   ```bash
   npm run dev
   ```
5. The frontend will start and be accessible at **`http://localhost:8080`**.

---

### Step 4: Login and Test the Workflows
1. Open your browser and navigate to **`http://localhost:8080/`**.
2. Log in using the default Admin account (`admin` / `admin123`).
3. You can explore the system by:
   * Registering new employees or managers via the Signup page (Admins approve manager accounts from the Admin Panel).
   * Creating requisitions as an Employee, approving them as a Manager, and converting them to POs.
   * Onboarding a Vendor at `/vendor-login` and logging in as the vendor to fulfill orders.
