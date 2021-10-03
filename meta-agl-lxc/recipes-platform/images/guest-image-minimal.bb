SUMMARY = "A minimal container guest image"

require recipes-platform/images/agl-image-boot.inc

IMAGE_LINGUAS = " "

IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

IMAGE_INSTALL_append = " \
    packagegroup-agl-ic-core \
"

IMAGE_INSTALL_remove = " \
    kernel-devicetree \
"
