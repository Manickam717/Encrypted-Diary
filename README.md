# 🔐 Encrypted Digital Diary (Java Console App)

A simple, secure, and beginner-friendly diary application built in Java. This project allows users to register, log in, and write personal diary entries — all stored in an encrypted format using a basic XOR cipher technique.

---

## ✨ Features

- 🧾 **User Registration & Login**  
  Securely register with a username and password. Only registered users can access their diary.

- 🛡️ **Encrypted Entries**  
  Every diary entry is encrypted using a custom XOR-based cipher. Even if someone opens the diary file, your notes remain unreadable without the correct password.

- 📅 **Timestamped Entries**  
  Entries are automatically saved with the current date, maintaining a daily log.

- 📂 **File-Based Storage**  
  All data is saved locally in `users.txt` and `diary.txt` — no database setup needed!

---

## 🧠 Concepts Used

- Java File I/O (BufferedReader, BufferedWriter)
- String manipulation & encryption logic
- Date and time handling (`LocalDate`)
- Console-based user interaction (`Scanner`)
- Modular programming using multiple classes

---

## 🚀 How to Run

1. Clone or download the repo  
2. Make sure Java is installed  
3. Compile the code:
4. Run the app:


---

## 🔐 Sample Encryption

- Plain text: "Today was a good day!"
- Password: "Muthu@1"
- Encrypted: "@ÿ×³ÛGÉ÷âÞÙ×þÐÏÍÍ"


---

## 📌 Notes

- This project is intended for **learning purposes** and uses a simple XOR encryption for demonstration.
- Avoid using it for real-life confidential data.
- Tested on Java 17 and above.

---

## 👨‍💻 Author

Made with ❤️ by Muthu Manickam M