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
SRCREV = "464ed5a672700436a1cb89d41afe8c088d2f3c5b"
