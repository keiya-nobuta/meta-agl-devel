SUMMARY = "libnv_hal for AGL software"
DESCRIPTION = "install libnv_hal to build AGL software"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

FILES_${PN}-dev += "${INCLUDEDIR}/native_service/* "

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/staging/basesystem.git;protocol=https;subpath=nv_hal/;branch=${AGL_BRANCH}"
SRCREV := "${AGL_DEFAULT_REVISION}"

PV = "1.0.0+gitr${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS += " ns-frameworkunified"

inherit agl-basesystem-hal

HAL_NAME = "nv_hal"
