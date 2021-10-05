FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-firmware_loader-load-files-from-the-mount-namespace-.patch \
"

