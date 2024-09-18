# Sadhanagc21

NIT3213 Android Application Development Project

Overview

This project is developed as part of the NIT3213 final assignment. The application showcases proficiency in API integration, user interface design, and adherence to Android development best practices. It includes three main screens: Login, Dashboard, and Details. The app interacts with the vu-nit3213-api for user authentication and data retrieval.

API Details
Base URL: https://vu-nit3213-api.onrender.com

Endpoints:
Login: POST /footscray/auth, /sydney/auth, or /ort/auth (used /sydney/auth)
Dashboard: GET /dashboard/{keypass}

Application Structure

1. Login Screen
 
Functionality: Allows users to log in using their first name as the username and student ID (format: s12345678) as the password.
API Integration: Authenticates the user via the /auth endpoint specific to their class location.
Post-login: Successful authentication redirects users to the Dashboard screen.
Error Handling: Displays appropriate error messages for unsuccessful login attempts.

4. Dashboard Screen
   
Functionality: Displays a list of entities using a RecyclerView.
Features: Each list item presents a summary of the entity, excluding the description.
Navigation: Users can click on individual items to navigate to the Details screen.

6. Details Screen
Functionality: Shows detailed information about the selected entity, including a description, in a user-friendly layout.

Features

Dependency Injection: Implemented with Hilt for clean and modular code.
RecyclerView: Utilized for efficient list display in the Dashboard screen.
Navigation: Smooth transitions between the Login, Dashboard, and Details screens.
Error Handling: Displays appropriate error messages for failed login attempts.
Unit Testing: Critical components are covered by unit tests.
Version Control: Managed using Git, with a clear and meaningful commit history.

Installation
Clone the repository:
bash
Copy code

git clone https://github.com/sumit961/SumitApi.git
Open the project in Android Studio.
Sync Gradle to ensure all dependencies are installed.
Build and run the project on an emulator or physical device.

Usage

Login: Enter your first name and student ID to log in.
Dashboard: Browse through the list of entities displayed.
Details: Click on any entity to view detailed information.

Dependencies
Hilt: For dependency injection.
Retrofit: For API requests.
Gson: For JSON parsing.
RecyclerView: For list display.
