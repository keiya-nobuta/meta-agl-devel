SUMMARY = "LXC ivi demo guest image"
LICENSE = "MIT"

require guest-image-minimal.bb

IMAGE_INSTALL += " \
    weston \
    wayland-ivi-extension \
    ilm-manager \
    weston-init-guest \
    mominavi \
    momiplay \
    qtquickcontrols \
    qtquickcontrols2 \
    qtwayland \
"
