# 🌸 WelcomeApp - Modern Authentication UI

  **A beautiful, modern authentication interface with stunning coral theme and smooth animations**

## ✨ Features

### 🎨 **Modern UI/UX Design**
- **Coral Pink Theme** - Eye-catching gradient background with soft coral tones
- **Wave Design** - Elegant curved wave transition between sections
- **Material Design 3** - Following the latest Material Design guidelines
- **Smooth Animations** - Fluid transitions between screens

### 🔐 **Authentication Features**
- **Welcome Screen** - Engaging onboarding experience
- **Sign In Screen** - Complete login interface with validation
- **Password Visibility Toggle** - Show/hide password with eye icon
- **Remember Me** - Custom styled checkbox
- **Forgot Password** - Quick password recovery access
- **Email Validation** - Real-time input validation

### 📱 **Technical Highlights**
- **100% Java** - Pure Java implementation
- **No Third-Party Libraries** - Lightweight and dependency-free (except Material Components)
- **Responsive Design** - Adapts to different screen sizes
- **Clean Architecture** - Well-organized and maintainable code
- **Custom Drawables** - All icons and shapes created with XML vectors

---

## 🚀 Installation

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 8 or higher
- Android SDK (API 21+)
- Gradle 7.0+

### Clone the Repository
```bash
git clone https://github.com/k-aghakhani/WelcomeApp.git
cd WelcomeApp
```

### Build the Project
1. Open Android Studio
2. Click **File → Open** and select the cloned directory
3. Wait for Gradle sync to complete
4. Click **Run** (▶️) or press `Shift + F10`

### Dependencies
```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.cardview:cardview:1.0.0'
}
```

---

## 📱 Usage

### Welcome Screen
The app launches with an attractive welcome screen featuring:
- Coral gradient background with decorative patterns
- White curved card with welcome message
- Continue button with forward arrow icon

### Sign In Screen
A complete authentication interface with:
- Email input with icon
- Password input with visibility toggle
- Remember Me checkbox
- Forgot Password link
- Login button
- Sign Up navigation

---

## 🎨 Color Palette

| Color | Hex | Usage |
|-------|-----|-------|
| Coral Primary | `#FF9A9A` | Buttons, accents, links |
| Background Coral | `#FFB5B5` | Main background |
| Text Dark | `#2D2D2D` | Primary text |
| Text Gray | `#9E9E9E` | Secondary text, icons |
| Input Border | `#E8E8E8` | Input field borders |

---

## 📁 Project Structure

```
WelcomeApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/welcomeapp/
│   │   │   ├── WelcomeActivity.java      # Welcome screen logic
│   │   │   └── SignInActivity.java       # Sign in screen logic
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_welcome.xml  # Welcome UI
│   │   │   │   └── activity_signin.xml   # Sign in UI
│   │   │   ├── drawable/
│   │   │   │   ├── gradient_background.xml
│   │   │   │   ├── wave_shape.xml
│   │   │   │   ├── input_background.xml
│   │   │   │   └── ic_*.xml              # Icon resources
│   │   │   ├── values/
│   │   │   │   ├── colors.xml            # Color definitions
│   │   │   │   ├── strings.xml           # String resources
│   │   │   │   └── themes.xml            # App themes
│   │   │   └── AndroidManifest.xml
│   │   └── build.gradle
│   └── ...
└── README.md
```

---

## 🛠️ Customization

### Change Colors
Edit `res/values/colors.xml`:
```xml
<color name="coral_primary">#FF9A9A</color>
<color name="background_coral">#FFB5B5</color>
```

### Modify Wave Shape
Edit `res/drawable/wave_shape.xml`:
```xml
<path android:pathData="M0,60 Q93.75,0 187.5,60 T375,60 L375,120 L0,120 Z" />
```

### Add New Screens
1. Create new layout XML in `res/layout/`
2. Create corresponding Activity in Java
3. Register Activity in `AndroidManifest.xml`

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the Project**
2. **Create your Feature Branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your Changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the Branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Ideas for Contribution
- [ ] Add Sign Up screen
- [ ] Implement Firebase Authentication
- [ ] Add biometric authentication
- [ ] Create dark mode theme
- [ ] Add animations and transitions
- [ ] Implement password strength indicator
- [ ] Add social media login options

---

## 📝 To-Do List

- [x] Welcome screen design
- [x] Sign in screen design
- [x] Email validation
- [x] Password visibility toggle
- [ ] Sign up screen
- [ ] Forgot password screen
- [ ] Backend integration
- [ ] SQLite local storage
- [ ] Shared Preferences for Remember Me
- [ ] Unit tests
- [ ] UI tests

---

## 🐛 Bug Reports

If you find a bug, please open an issue on GitHub with:
- Description of the bug
- Steps to reproduce
- Expected behavior
- Screenshots (if applicable)
- Device and Android version

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 k-aghakhani

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 👨‍💻 Author

**k-aghakhani**

- GitHub: [@k-aghakhani](https://github.com/k-aghakhani)
- Repository: [WelcomeApp](https://github.com/k-aghakhani/WelcomeApp)

---

## 🌟 Show Your Support

If you found this project helpful, please give it a ⭐️!

---

## 📞 Contact

Have questions or suggestions? Feel free to reach out!

- Open an issue on GitHub
- Submit a pull request
- Star the repository if you like it!

*Email: kiarash1988@gmail.com  *
---

<div align="center">
  
  **Made with ❤️ and ☕**
  
  *Happy Coding!* 🚀

</div>


