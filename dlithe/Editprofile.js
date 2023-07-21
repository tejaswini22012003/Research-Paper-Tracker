// Function to handle form submission
function handleSubmit(event) {
    event.preventDefault(); // Prevent form from submitting
  
    // Get form values
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    const usn = document.getElementById('usn').value;
    const college = document.getElementById('college').value;
    const department = document.getElementById('department').value;
    const resetPassword = document.getElementById('resetPassword').value;
    const dob = document.getElementById('dob').value;
    const gender = document.querySelector('input[name="gender"]:checked').value;
    const nationality = document.querySelector('input[name="nationality"]:checked').value;
    const state = document.getElementById('state').value;
    const address = document.getElementById('address').value;
  
    // Display the form data
    console.log('Name:', name);
    console.log('Email:', email);
    console.log('Phone:', phone);
    console.log('USN/Faculty ID:', usn);
    console.log('College Name:', college);
    console.log('Department:', department);
    console.log('Reset Password:', resetPassword);
    console.log('Date of Birth:', dob);
    console.log('Gender:', gender);
    console.log('Nationality:', nationality);
    console.log('State:', state);
    console.log('Address:', address);
  
    // TODO: Send the form data to the server or perform any other necessary actions
  
    // Reset the form
    event.target.reset();
  }
  
  // Add event listener to the form submit button
  const form = document.querySelector('form');
  form.addEventListener('submit', handleSubmit);
s  