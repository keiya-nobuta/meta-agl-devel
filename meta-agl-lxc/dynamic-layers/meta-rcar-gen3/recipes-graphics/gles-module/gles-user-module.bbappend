RDEPENDS_${PN}_remove_aglcontainerguest = "kernel-module-gles"

PACKAGES_append = "\
    ${PN}-firmware \
"

FILES_${PN} = " \
    ${sysconfdir}/* \
    ${libdir}/* \
    ${RENESAS_DATADIR}/bin/* \
    ${exec_prefix}/bin/* \
"

FILES_${PN}-firmware = " \
    /lib/firmware/rgx.fw* \
"
