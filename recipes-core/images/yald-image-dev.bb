require yald-image-prod.bb

# Add packages specific to development build
IMAGE_INSTALL:append = " bash"
