const previousPublicationsRadio = document.querySelector('input[name="previous_publications"]');
const linkField = document.getElementById('link_field');

previousPublicationsRadio.addEventListener('change', function() {
  if (this.value === 'yes') {
    linkField.style.display = 'block';
  } else {
    linkField.style.display = 'none';
  }
});
