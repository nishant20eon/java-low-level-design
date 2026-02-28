.PHONY: create-problem

# Usage: make create-problem NAME=03-your-system-name DOMAIN=yoursystemname
# Example: make create-problem NAME=03-user-management DOMAIN=user

create-problem:
	@powershell -NoProfile -Command \
		"if ('$(NAME)' -eq '') { Write-Host 'Error: NAME is required'; Write-Host 'Usage: make create-problem NAME=03-your-system-name DOMAIN=yoursystemname'; exit 1 }; \
		if ('$(DOMAIN)' -eq '') { Write-Host 'Error: DOMAIN is required'; Write-Host 'Usage: make create-problem NAME=03-your-system-name DOMAIN=yoursystemname'; exit 1 }; \
		Write-Host 'Creating folder structure for $(NAME) with domain $(DOMAIN)...'; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/src/com/lld/$(DOMAIN)/bad' | Out-Null; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/src/com/lld/$(DOMAIN)/good/model' | Out-Null; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/src/com/lld/$(DOMAIN)/good/notification' | Out-Null; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/src/com/lld/$(DOMAIN)/good/repository' | Out-Null; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/src/com/lld/$(DOMAIN)/good/service' | Out-Null; \
		New-Item -ItemType Directory -Force -Path '$(NAME)/uml' | Out-Null; \
		Write-Host ''; \
		Write-Host 'Creating template files...'; \
		'# $(NAME) Design' | Out-File -FilePath '$(NAME)/design.md' -Encoding UTF8; \
		'' | Out-File -FilePath '$(NAME)/design.md' -Append -Encoding UTF8; \
		'## Overview' | Out-File -FilePath '$(NAME)/design.md' -Append -Encoding UTF8; \
		'## SOLID Principles' | Out-File -FilePath '$(NAME)/design.md' -Append -Encoding UTF8; \
		'## Architecture' | Out-File -FilePath '$(NAME)/design.md' -Append -Encoding UTF8; \
		'# $(NAME)' | Out-File -FilePath '$(NAME)/README.md' -Encoding UTF8; \
		'' | Out-File -FilePath '$(NAME)/README.md' -Append -Encoding UTF8; \
		'This folder contains examples of SOLID principles applied to $(NAME).' | Out-File -FilePath '$(NAME)/README.md' -Append -Encoding UTF8; \
		'## Bad Design' | Out-File -FilePath '$(NAME)/README.md' -Append -Encoding UTF8; \
		'## Good Design' | Out-File -FilePath '$(NAME)/README.md' -Append -Encoding UTF8; \
		'\"\"\"' | Out-File -FilePath '$(NAME)/uml/class-diagram.puml' -Encoding UTF8; \
		'@startuml' | Out-File -FilePath '$(NAME)/uml/class-diagram.puml' -Append -Encoding UTF8; \
		''' Class Diagram for $(NAME)' | Out-File -FilePath '$(NAME)/uml/class-diagram.puml' -Append -Encoding UTF8; \
		'@enduml' | Out-File -FilePath '$(NAME)/uml/class-diagram.puml' -Append -Encoding UTF8; \
		'\"\"\"' | Out-File -FilePath '$(NAME)/uml/sequence-diagram.puml' -Encoding UTF8; \
		'@startuml' | Out-File -FilePath '$(NAME)/uml/sequence-diagram.puml' -Append -Encoding UTF8; \
		''' Sequence Diagram for $(NAME)' | Out-File -FilePath '$(NAME)/uml/sequence-diagram.puml' -Append -Encoding UTF8; \
		'@enduml' | Out-File -FilePath '$(NAME)/uml/sequence-diagram.puml' -Append -Encoding UTF8; \
		Write-Host ''; \
		Write-Host 'Folder structure created successfully!'; \
		Write-Host ''; \
		Write-Host 'Next steps:'; \
		Write-Host '1. Navigate to the new folder: cd $(NAME)'; \
		Write-Host '2. Create your Java files in src/com/lld/$(DOMAIN)/bad and good directories'; \
		Write-Host '3. Update design.md with architecture details'; \
		Write-Host '4. Update class-diagram.puml and sequence-diagram.puml with UML diagrams'"

