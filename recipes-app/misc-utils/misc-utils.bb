DESCRIPTION = "TSN use space misc miscellaneous utilities"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI ="git://gitenterprise.xilinx.com/ckalluri/tsn-packages.git;branch=${BRANCH};protocol=https"
BRANCH="main"

SRCREV="${AUTOREV}"

S = "${WORKDIR}/git/misc-utils"

TARGET_CC_ARCH += "${LDFLAGS}"

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf"

LIB_PATH = "${STAGING_DIR_TARGET}/usr/lib"

do_compile () {

    cd ${S}
    ${CC} switch_cam.c -lm -o switch_cam
    ${CC} switch_cam2.c -lm -o switch_cam2
    ${CC} switch_prog.c -lm -o switch_prog
    ${CC} qci_prog.c -lm -o qci_prog
    ${CC} vconfig.c -o vconfig
    ${CC} ptptime.c -o ptptime
    ${CC} ptptime_date.c -o ptptime_date
    ${CC} cb_prog.c -lm -o cb_prog
    ${CC} -I"${LIB_PATH}" qbv_sched.c -o qbv_sched -lconfig
    ${CC} ipic_prog.c -o ipic_prog
    ${CC} br_prog.c -o br_prog
    ${CC} qbu_prog.c -o qbu_prog
    ${CC} -I"${LIB_PATH}" tadma_prog.c -o tadma_prog -lconfig
}

do_install () {
    install -d ${D}${sbindir}
    install -d ${D}${sysconfdir}
    install -d ${D}/${sbindir}/libconf-1.0.0

    install -m 0755 switch_cam ${D}${sbindir}/
    install -m 0755 switch_cam2 ${D}${sbindir}/
    install -m 0755 switch_prog ${D}${sbindir}/
    install -m 0755 qci_prog ${D}${sbindir}/
    install -m 0755 cb_prog ${D}${sbindir}/
    install -m 0755 vconfig ${D}${sbindir}/
    install -m 0755 ptptime ${D}${sbindir}/
    install -m 0755 ptptime_date ${D}${sbindir}/
    install -m 0755 qbv_sched ${D}${sbindir}/
    install -m 0755 ipic_prog ${D}${sbindir}/
    install -m 0755 br_prog ${D}${sbindir}/
    install -m 0755 qbu_prog ${D}${sbindir}/
    install -m 0755 tadma_prog ${D}${sbindir}/

    install -m 644 ${S}/confs/* ${D}${sbindir}/

    install -m 0755 qbv.cfg ${D}${sysconfdir}/
    install -m 0755 streams.cfg ${D}${sysconfdir}/
    
}
