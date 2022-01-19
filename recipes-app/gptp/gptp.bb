DESCRIPTION = "TSN use space gptp utilities"
SECTION = "gptp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI ="git://gitenterprise.xilinx.com/ckalluri/tsn-packages.git;branch=${BRANCH};protocol=https"
BRANCH="main"

SRCREV="${AUTOREV}"


S = "${WORKDIR}/git/Open-AVB"

TARGET_CC_ARCH += "${LDFLAGS}"

do_configure[noexec] = '1'

do_compile () {

    mkdir -p ${S}/daemons/gptp/linux/build/obj
    make -C ${S}/daemons/gptp/linux/build clean

    make -C ${S} tsn_talker_clean
    make -C ${S} tsn_listener_clean

    make -C ${S}/daemons/gptp/linux/build
    make -C ${S} tsn_talker
    make -C ${S} tsn_listener

}

do_install () {
 	install -d ${D}${sbindir}
	install -m 755 ${S}/daemons/gptp/linux/build/obj/daemon_cl ${D}${sbindir}/
	install -m 755 ${S}/examples/tsn_talker/tsn_talker ${D}${sbindir}/
	install -m 755 ${S}/examples/tsn_listener/tsn_listener ${D}${sbindir}/
}
