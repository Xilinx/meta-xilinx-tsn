DESCRIPTION = "TSN use space gptp utilities"
SECTION = "packeth"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit autotools 

SRC_URI ="https://sourceforge.net/projects/packeth/files/packeth-old/packETH-1.8.tar.bz"

SRC_URI[sha256sum] = "0b9333640bf7c0f31190c6fa348224864bc4603519a441438085177ae4d1116e"
TARGET_CC_ARCH += "${LDFLAGS}"

S = "${WORKDIR}/packETH-1.8"

do_compile () {
 
    cd ${WORKDIR}
    tar -xvf ${WORKDIR}/packETH-1.8.tar.bz
    ${CC} -g -O2 -Wall -Wunused -Wmissing-prototypes -Wmissing-declarations \
        ${S}/cli/cli_send.c -lm -lpthread -o packETHcli
}

do_install () {
        install -d ${D}${sbindir}
        install -m 755 ${WORKDIR}/packETHcli ${D}${sbindir}/
}

