DESCRIPTION = "TSN use space gptp utilities"
SECTION = "gptp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI ="git://github.com/Avnu/gptp.git;branch=${BRANCH};protocol=https"
BRANCH="master"

SRCREV="0baef8a36a13105112862919aac0f1eed21a44ea"

inherit cmake pkgconfig

DEPENDS = "cmake-native"

S = "${WORKDIR}/git"

do_configure () {
	
	rm -rf ${S}/build
}

do_compile () {
	
        cd ${S}
        ./travis.sh

}

do_install () {
	install -d ${D}${sbindir}
	install -m 755 ${S}/build/gptp ${D}${sbindir}/
}
