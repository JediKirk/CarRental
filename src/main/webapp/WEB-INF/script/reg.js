var phoneMask = IMask(
    document.getElementById('phone-mask'), {
        mask: '+{375} (00) 000-00-00'
    });

document.getElementById('regForm').onsubmit = () => {
    setTimeout(() => {
        document.location.href = '../register_add.html';
    }, 0);
}