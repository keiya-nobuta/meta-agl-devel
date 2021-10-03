SUMMARY     = "AGL Instrument Cluster API library"
DESCRIPTION = "AGL Instrument Cluster API is defined common function API for Instrument Cluster.\
               This API was contributed by four Instrument Cluster company."
HOMEPAGE    = "https://confluence.automotivelinux.org/display/IC"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

inherit cmake pkgconfig

DEPENDS = "libclusteripc"

S = "${WORKDIR}/git"

BRANCH = "master"
SRC_URI = "git://git.automotivelinux.org/src/libcluster-api;protocol=https;branch=${BRANCH}"
SRCREV = "fa8ad7927ede4f2a825021d13a8024742b8cb225"

EXTRA_OECMAKE_append = " \
        -DCMAKE_SYSROOT=${RECIPE_SYSROOT} \
"
