DESCRIPTION = "TSN use space gptp utilities"
SECTION = "packeth"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI ="file://packETH-1.8.tar.gz"

S = "${WORKDIR}/packETH-1.8"
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    ${CC} -g -O2 -Wall -Wunused -Wmissing-prototypes -Wmissing-declarations \
        ${S}/cli/cli_send.c -lm -lpthread -o packETHcli
}

do_install () {
        install -d ${D}${sbindir}
        install -m 755 ${S}/packETHcli ${D}${sbindir}/
}

