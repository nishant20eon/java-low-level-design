# Quick Reference - Makefile Commands

## Quick Start

```bash
cd solid-principle/problems
make create-problem NAME=03-your-name DOMAIN=yourdomain
```

## Examples

| Problem | Command |
|---------|---------|
| User Management | `make create-problem NAME=03-user-management DOMAIN=user` |
| Email Service | `make create-problem NAME=03-email-service DOMAIN=email` |
| Product Catalog | `make create-problem NAME=03-product-catalog DOMAIN=product` |
| Notification System | `make create-problem NAME=03-notification-system DOMAIN=notification` |
| Inventory Management | `make create-problem NAME=03-inventory-management DOMAIN=inventory` |

## Parameters Explained

- **NAME**: Problem folder name in format `NN-kebab-case` (e.g., `03-user-management`)
- **DOMAIN**: Package domain name in lowercase (e.g., `user`, `email`, `product`)

## Naming Conventions

| Component | Convention | Example |
|-----------|-----------|---------|
| Folder Name | `NN-kebab-case` | `03-user-management` |
| Domain Name | `lowercase` | `user`, `email` |
| Java Classes | `PascalCase` | `UserService.java` |
| Package | `com.lld.{domain}` | `com.lld.user` |

## Directory Structure Created

```
03-your-name/
├── design.md                           # Architecture & SOLID principles
├── README.md                           # Problem overview
├── src/com/lld/{domain}/
│   ├── bad/                            # Bad design examples
│   └── good/                           # Good design (SOLID)
│       ├── model/                      # Data models
│       ├── notification/               # Notifications
│       ├── repository/                 # Data access
│       └── service/                    # Business logic
└── uml/
    ├── class-diagram.puml              # Class diagram
    └── sequence-diagram.puml           # Sequence diagram
```

## Troubleshooting

| Issue | Solution |
|-------|----------|
| `make: command not found` | Install GNU Make (`choco install make` on Windows) |
| `Error: NAME is required` | Add `NAME=your-problem-name` to the command |
| `Error: DOMAIN is required` | Add `DOMAIN=yourdomain` to the command |
| Folder not created | Run `make create-problem NAME=... DOMAIN=...` from `solid-principle/problems/` |

## After Creating Structure

1. **Add Java files** in `bad/` and `good/` directories
2. **Update design.md** with architecture explanation
3. **Update class-diagram.puml** with class structures
4. **Update sequence-diagram.puml** with interaction flows
5. **Update README.md** with problem description

---

For more details, see:
- `MAKEFILE_GUIDE.md` - Complete usage guide
- `MAKEFILE_SUMMARY.md` - Implementation details

