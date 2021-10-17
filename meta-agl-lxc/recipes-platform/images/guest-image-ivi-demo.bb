SUMMARY = "LXC ivi demo guest image"
LICENSE = "MIT"

require guest-image-minimal.bb

IMAGE_INSTALL += " \
    weston \
    wayland-ivi-extension \
    ilm-manager \
    systemd-netif-config \
    weston-init-guest \
    mominavi \
    momiplay \
    momiscreen \
    qtquickcontrols \
    qtquickcontrols2 \
    qtwayland \
    \
    ttf-dejavu-sans \
    ttf-dejavu-sans-mono \
    ttf-dejavu-sans-condensed \
    ttf-dejavu-serif \
    ttf-dejavu-serif-condensed \
    ttf-dejavu-mathtexgyre \
    ttf-dejavu-common \
    \
    ca-certificates \
"
