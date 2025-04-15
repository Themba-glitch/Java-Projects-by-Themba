<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Password Generator</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin: 50px; }
        .container { max-width: 400px; margin: auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; }
        input, button { margin: 10px 0; padding: 10px; width: 100%; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Password Generator</h2>
        <label for="length">Password Length:</label>
        <input type="number" id="length" min="4" max="20" value="12">
        <button onclick="generatePassword()">Generate Password</button>
        <input type="text" id="password" readonly>
    </div>
    
    <script>
        function generatePassword() {
            const length = document.getElementById('length').value;
            const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
            let password = "";
            for (let i = 0; i < length; i++) {
                const randomIndex = Math.floor(Math.random() * chars.length);
                password += chars[randomIndex];
            }
            document.getElementById('password').value = password;
        }
    </script>
</body>
</html>
