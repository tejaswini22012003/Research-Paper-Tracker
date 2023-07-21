document.getElementById('upload_picture').addEventListener('change', handleProfilePictureUpload);

function handleProfilePictureUpload(event) {
  const file = event.target.files[0];
  const label = event.target.previousElementSibling;

  if (file) {
    const reader = new FileReader();
    reader.readAsDataURL(file);

    reader.onload = function(e) {
      label.style.backgroundImage = `url('${e.target.result}')`;
      label.style.backgroundSize = 'cover';
      label.style.backgroundPosition = 'center';
      label.textContent = '';
    };
  } else {
    label.style.backgroundImage = '';
    label.textContent = 'Profile';
  }
}
