SUMMARY = "LXC host demo image"
LICENSE = "MIT"

require lxc-host-image-minimal.bb

CONTAINER_IMAGES ?= "agl-container-cluster:guest-image-cluster-demo \
                     agl-container-ivi:guest-image-ivi-demo \
                    "

IMAGE_INSTALL += " \
    kernel-modules \
    pipewire pipewire-alsa alsa-utils \
    ${@bb.utils.contains('AGL_FEATURES', 'agl-drm-lease', 'drm-lease-manager', '', d)} \
"

IMAGE_INSTALL_append_rcar-gen3 = " kernel-module-gles "
