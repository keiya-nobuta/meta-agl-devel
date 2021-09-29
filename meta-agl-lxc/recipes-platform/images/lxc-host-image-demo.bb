SUMMARY = "LXC host demo image"
LICENSE = "MIT"

require lxc-host-image-minimal.bb

CONTAINER_IMAGES ?= "agl-container-guest:guest-image-cluster-demo"

IMAGE_INSTALL += " \
    kernel-modules \
    alsa-utils \
    packagegroup-pipewire \
    pipewire-ic-ipc \
    ${@bb.utils.contains('AGL_FEATURES', 'agl-drm-lease', 'drm-lease-manager', '', d)} \
"

IMAGE_INSTALL:append:rcar-gen3 = " kernel-module-gles "
