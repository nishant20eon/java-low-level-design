# Makefile Guide - Creating New SOLID Principle Problems

This guide explains how to use the Makefile to create new problem folders with the standard structure.

## Prerequisites

You need to have `make` installed on your system. On Windows, you can:
- Install GNU Make via Chocolatey: `choco install make`
- Or use Windows Subsystem for Linux (WSL)
- Or use MinGW/MSYS2

## Usage

Navigate to the `solid-principle/problems/` directory and run the following command:

```bash
make create-problem NAME=<folder-name> DOMAIN=<domain-name>
```

### Parameters

- **NAME**: The folder name for your new problem (e.g., `03-user-management`)
- **DOMAIN**: The domain name used in the Java package structure (e.g., `user`, `payment`, `order`)

## Examples

### Example 1: Creating a User Management System Problem

```bash
cd solid-principle/problems
make create-problem NAME=03-user-management DOMAIN=user
```

This will create:
```
03-user-management/
├── design.md
├── README.md
├── src/
│   └── com/
│       └── lld/
│           └── user/
│               ├── bad/
│               └── good/
│                   ├── model/
│                   ├── notification/
│                   ├── repository/
│                   └── service/
└── uml/
    ├── class-diagram.puml
    └── sequence-diagram.puml
```

### Example 2: Creating a Product Catalog Problem

```bash
make create-problem NAME=04-product-catalog DOMAIN=product
```

### Example 3: Creating an Email Service Problem

```bash
make create-problem NAME=05-email-service DOMAIN=email
```

## Folder Structure Explained

The generated structure includes:

- **design.md**: Document your system design, architecture decisions, and SOLID principles applied
- **README.md**: Overview of the problem and links to bad/good design implementations
- **src/com/lld/{domain}/bad/**: Implementation showing poor design (violating SOLID principles)
- **src/com/lld/{domain}/good/**: Implementation showing good design (following SOLID principles)
  - **model/**: Data classes
  - **notification/**: Notification-related interfaces and implementations
  - **repository/**: Data access layer
  - **service/**: Business logic layer
- **uml/class-diagram.puml**: PlantUML class diagram
- **uml/sequence-diagram.puml**: PlantUML sequence diagram

## Next Steps After Running the Command

1. **Navigate to your new folder**:
   ```bash
   cd 03-user-management
   ```

2. **Create Java files** in the appropriate directories:
   - Add main classes in `bad/` and `good/` directories
   - Implement models in `good/model/`
   - Implement services in `good/service/`
   - Implement repositories in `good/repository/`
   - Implement notifications in `good/notification/`

3. **Update documentation**:
   - Edit `design.md` with architecture details and SOLID principles explanations
   - Update `README.md` with problem description and solution overview

4. **Create UML diagrams**:
   - Update `uml/class-diagram.puml` with class structure
   - Update `uml/sequence-diagram.puml` with interaction flow

## Naming Convention

- Problem folders: `NN-kebab-case-name` (e.g., `03-user-management`, `04-product-catalog`)
- Domain names: `lowercase` (e.g., `user`, `product`, `email`)
- Java files: `PascalCase.java` (e.g., `UserService.java`, `ProductRepository.java`)

## Troubleshooting

### Command not found: make
Install GNU Make on your system:
- **Windows (Chocolatey)**: `choco install make`
- **Windows (Scoop)**: `scoop install make`
- **Linux**: `sudo apt-get install make` (Debian/Ubuntu)
- **macOS**: `brew install make`

### Error: NAME is required
Make sure you provide the NAME parameter:
```bash
make create-problem NAME=03-system-name DOMAIN=domain
```

### Error: DOMAIN is required
Make sure you provide the DOMAIN parameter:
```bash
make create-problem NAME=03-system-name DOMAIN=domain
```

## Customization

You can modify the Makefile to:
- Add more directory structures
- Create additional template files
- Change the template content for design.md and README.md

Just edit the `Makefile` in the `solid-principle/problems/` directory.

