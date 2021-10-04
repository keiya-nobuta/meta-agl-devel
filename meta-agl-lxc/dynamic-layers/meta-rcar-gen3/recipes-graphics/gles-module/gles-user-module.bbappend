RDEPENDS_${PN}_remove_aglcontainerguest = "kernel-module-gles"

PACKAGES_append = "\
    ${PN}-firmware \
"

FILES_${PN} = " \
    ${libdir}/* \
    ${RENESAS_DATADIR}/bin/dlcsrv_REL \
"
SYSTEMD_SERVICE_${PN} = ""

FILES_${PN}-firmware = " \
    ${systemd_system_unitdir}/* \
    ${sysconfdir}/* \
    /lib/firmware/rgx.fw* \
    ${exec_prefix}/bin/pvrinit \
"
SYSTEMD_SERVICE_${PN}-firmware = "rc.pvr.service"
