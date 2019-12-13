require pipewire.inc

SRC_URI = "git://gitlab.freedesktop.org/pipewire/pipewire.git;protocol=https;branch=master \
    file://0001-meson-revert-version-check-to-require-meson-0.47-not.patch \
    file://0002-arm-build-with-mno-unaligned-access.patch \
    file://0003-gst-Implement-new-pwaudio-src-sink-elements-based-on.patch \
    file://0004-audioconvert-always-assume-that-output-ports-are-NOT.patch \
    file://0005-module-access-add-same-sec-label-mode.patch \
    "

SRCREV = "b0932e687fc47e0872ca291531f2291d99042d70"

PV = "0.2.91+git${SRCPV}+1"
S  = "${WORKDIR}/git"

RDEPENDS_${PN} += "virtual/pipewire-sessionmanager virtual/pipewire-config"
