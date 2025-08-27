<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome - Student Management System</title>
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700&display=swap');

    :root {
      --primary: #006d77;
      --primary-dark: #83c5be;
      --white: #ffffff;
      --gray: #f8f9fa;
      --dark: #212529;
    }

    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: 'Montserrat', sans-serif;
    }

    body {
      background: linear-gradient(135deg, var(--primary), var(--primary-dark));
      height: 100vh;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      overflow: hidden;
      position: relative;
    }

    .particles {
      position: absolute;
      width: 100%;
      height: 100%;
      z-index: 1;
    }

    .welcome-wrapper {
      display: flex;
      width: 90%;
      max-width: 1400px;
      align-items: center;
      justify-content: space-between;
      z-index: 2;
    }

    .side-image {
      flex: 1;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 20px;
    }

    .side-image img {
      max-width: 100%;
      height: auto;
      max-height: 400px;
      border-radius: 15px;
      box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2);
      transition: transform 0.5s ease;
    }

    .side-image img:hover {
      transform: scale(1.05);
    }

    .welcome-container {
      flex: 1;
      position: relative;
      text-align: center;
      color: white;
      padding: 40px;
      background: rgba(255, 255, 255, 0.15);
      border-radius: 20px;
      backdrop-filter: blur(10px);
      border: 1px solid rgba(255, 255, 255, 0.2);
      box-shadow: 0 25px 50px -12px rgba(0, 0, 0, 0.25);
      max-width: 600px;
      margin: 0 20px;
    }

    h2 {
      font-size: 2.5rem;
      margin-bottom: 20px;
      font-weight: 600;
      color: var(--white);
    }

    .welcome-text {
      font-size: 1.1rem;
      line-height: 1.6;
      margin-bottom: 30px;
      text-align: center;
      color: rgba(255, 255, 255, 0.9);
    }

    .highlight {
      font-weight: 600;
      color: var(--white);
    }

    .button-container {
      display: flex;
      gap: 20px;
      justify-content: center;
      flex-wrap: wrap;
    }

    .btn {
      padding: 15px 30px;
      background: rgba(255, 255, 255, 0.2);
      color: white;
      border: 2px solid rgba(255, 255, 255, 0.4);
      border-radius: 10px;
      font-size: 1rem;
      font-weight: 600;
      cursor: pointer;
      transition: all 0.3s ease;
      text-decoration: none;
      min-width: 150px;
    }

    .btn:hover {
      background: rgba(255, 255, 255, 0.3);
      transform: translateY(-3px);
      box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
    }

    .btn-primary {
      background: linear-gradient(to right, var(--primary), var(--primary-dark));
      border: none;
    }

    .btn-primary:hover {
      background: linear-gradient(to right, #004e56, #68a7a0);
    }

    footer {
      position: absolute;
      bottom: 20px;
      color: var(--white);
      font-size: 0.9rem;
      z-index: 2;
      text-align: center;
      width: 100%;
    }

    @media (max-width: 900px) {
      .welcome-wrapper {
        flex-direction: column;
      }

      .side-image {
        display: none;
      }

      .welcome-container {
        margin: 20px 0;
      }
    }
  </style>
</head>
<body>
  <div class="particles" id="particles-js"></div>

  <div class="welcome-wrapper">
    <div class="side-image">
      <img src="https://img.freepik.com/free-vector/student-study-concept_23-2148499326.jpg" alt="Student illustration">
    </div>

    <div class="welcome-container">
      <h2>Welcome to Student Management System</h2>
      <p class="welcome-text">
        "Simplifying <span class="highlight">academic administration</span> and enhancing student performance tracking
         to ensure <span class="highlight">every learner thrives with structured guidance</span> and intelligent records."
      </p>
      <div class="button-container">
        <a href="http://localhost:8080/StudentManagementSystem/login.html" class="btn btn-primary">Login</a>
        <a href="http://localhost:8080/StudentManagementSystem/signup.html" class="btn">Signup</a>
      </div>
    </div>
  </div>

  <footer>Student Management System © 2025 | Empowering Education Through Innovation</footer>

  <script src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script>
  <script>
    particlesJS("particles-js", {
      "particles": {
        "number": { "value": 80, "density": { "enable": true, "value_area": 800 }},
        "color": { "value": "#ffffff" },
        "shape": { "type": "circle", "stroke": { "width": 0, "color": "#000000" }},
        "opacity": {
          "value": 0.5,
          "random": true,
          "anim": { "enable": true, "speed": 1, "opacity_min": 0.1, "sync": false }
        },
        "size": {
          "value": 3,
          "random": true,
          "anim": { "enable": true, "speed": 2, "size_min": 0.1, "sync": false }
        },
        "line_linked": {
          "enable": true,
          "distance": 150,
          "color": "#ffffff",
          "opacity": 0.2,
          "width": 1
        },
        "move": {
          "enable": true,
          "speed": 1,
          "direction": "none",
          "random": true,
          "straight": false,
          "out_mode": "out",
          "bounce": false,
          "attract": { "enable": true, "rotateX": 600, "rotateY": 1200 }
        }
      },
      "interactivity": {
        "detect_on": "canvas",
        "events": {
          "onhover": { "enable": true, "mode": "grab" },
          "onclick": { "enable": true, "mode": "push" },
          "resize": true
        },
        "modes": {
          "grab": { "distance": 140, "line_linked": { "opacity": 0.5 }},
          "push": { "particles_nb": 4 }
        }
      },
      "retina_detect": true
    });
  </script>
</body>
</html>
