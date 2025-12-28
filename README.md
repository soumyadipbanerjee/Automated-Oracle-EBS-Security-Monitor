Automated Oracle EBS Security Monitor
Overview
This project is a security automation tool designed for Oracle EBS environments. It monitors user login attempts within the database and uses a Java-based logic engine to automatically lock accounts that exceed security thresholds (e.g., more than 3 failed attempts), preventing unauthorized access to sensitive financial data.

Features
Security Tracking: Uses an Oracle SQL table to track login failures and account statuses.

Automated Lockout: Java utility that identifies high-risk users and updates their status in real-time.

EBS Simulation: Mimics the standard user security protocols found in the Oracle FND (Foundation) module.

Tech Stack
Database: Oracle SQL / PL/SQL

Programming: Java (JDBC)

Domain: Oracle EBS Security & Administration

How It Works
Database Setup: Run the xx_ebs_user_security.sql script to create the monitoring table and mock user data.

Java Execution: Run the EBSSecurityManager.java program.

Action: The Java app connects via JDBC, scans for users with failed_attempts > 3, and executes a SQL UPDATE to change their status to LOCKED.
