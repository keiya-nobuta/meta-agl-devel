SUMMARY     = "AGL Instrument Cluster IPC library"
DESCRIPTION = "AGL Instrument Cluster IPC is IPC framework for the AGL Instrument Cluster API.\
               This library was contributed by four Instrument Cluster company."
HOMEPAGE    = "https://confluence.automotivelinux.org/display/IC"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

inherit cmake pkgconfig

S = "${WORKDIR}/git"

BRANCH = "master"
SRC_URI = "git://git.automotivelinux.org/src/libcluster-ipc;protocol=https;branch=${BRANCH}"
SRCREV = "b27fb69aa966866920e86b10f7d10326a0042e33"

EXTRA_OECMAKE_append = " \
     -DCMAKE_SYSROOT=${RECIPE_SYSROOT} \
"
