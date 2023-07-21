function buttonClick(event) {
    var buttonId = event.target.id;
    
    // Perform different actions based on the button clicked
    if (buttonId === "btn_register" || buttonId === "btn_signup") {
      // Code for register/sign up button click
      window.location.href = "registration.html";
    } else if (buttonId === "btn_login") {
      // Code for login button click
      window.location.href = "login.html";
    }
  }
  
  // Add event listeners to all the buttons
  var registerButton = document.getElementById("btn_register");
  registerButton.addEventListener("click", buttonClick);
  
  var loginButton = document.getElementById("btn_login");
  loginButton.addEventListener("click", buttonClick);
  
  var signUpButton = document.getElementById("btn_signup");
  signUpButton.addEventListener("click", buttonClick);
  function buttonClick(event) {
    var buttonId = event.target.id;
    
    // Perform different actions based on the button clicked
    if (buttonId === "btn_register" || buttonId === "btn_signup") {
      // Code for register/sign up button click
      window.location.href = "registration.html";
    } else if (buttonId === "btn_login") {
      // Code for login button click
      window.location.href = "login.html";
    }
  }
  
  // Add event listeners to all the buttons
  var registerButton = document.getElementById("btn_register");
  registerButton.addEventListener("click", buttonClick);
  
  var loginButton = document.getElementById("btn_login");
  loginButton.addEventListener("click", buttonClick);
  
  var signUpButton = document.getElementById("btn_signup");
  signUpButton.addEventListener("click", buttonClick);
    