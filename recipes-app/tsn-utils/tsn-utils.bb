DESCRIPTION = "TSN user space miscellaneous utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d4726d3931414cd9c75119a96a1151da"

BRANCH = "main"
SRC_URI = "git://github.com/Xilinx/tsn-utils.git;branch=${BRANCH};protocol=https"
SRCREV = "7864c158b3811425cac80a87abc6db7e72d9a508"

S = "${WORKDIR}/git"

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf"

do_install () {
    install -d ${D}${sbindir}
    install -m 0755 ${S}/tsn-apps/br_prog/br_prog ${D}${sbindir}/br_prog
    install -m 0755 ${S}/tsn-apps/cb_prog/cb_prog ${D}${sbindir}/cb_prog
    install -m 0755 ${S}/tsn-apps/ipic_prog/ipic_prog ${D}${sbindir}/ipic_prog
    install -m 0755 ${S}/tsn-apps/ptptime/ptptime ${D}${sbindir}/ptptime
    install -m 0755 ${S}/tsn-apps/ptptime_date/ptptime_date ${D}${sbindir}/ptptime_date
    install -m 0755 ${S}/tsn-apps/qbu_prog/qbu_prog ${D}${sbindir}/qbu_prog
    install -m 0755 ${S}/tsn-apps/qbv_sched/qbv_sched ${D}${sbindir}/qbv_sched
    install -m 0755 ${S}/tsn-apps/qci_prog/qci_prog ${D}${sbindir}/qci_prog
    install -m 0755 ${S}/tsn-apps/switch_cam/switch_cam ${D}${sbindir}/switch_cam
    install -m 0755 ${S}/tsn-apps/switch_cam2/switch_cam2 ${D}${sbindir}/switch_cam2
    install -m 0755 ${S}/tsn-apps/switch_prog/switch_prog ${D}${sbindir}/switch_prog
    install -m 0755 ${S}/tsn-apps/tadma_prog/tadma_prog ${D}${sbindir}/tadma_prog
    install -m 0644 ${S}/tsn-conf/*.conf ${D}${sbindir}

    install -d ${D}${sysconfdir}
    install -m 0755 ${S}/tsn-conf/*.cfg ${D}${sysconfdir}
}
