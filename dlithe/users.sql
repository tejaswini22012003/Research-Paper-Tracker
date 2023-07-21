CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  phone VARCHAR(15) NOT NULL,
  usn_faculty_id VARCHAR(20) NOT NULL,
  college_name VARCHAR(100) NOT NULL,
  user_type ENUM('student', 'faculty') NOT NULL
);
