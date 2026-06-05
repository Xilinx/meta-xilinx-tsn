SUMMARY = "User-space gPTP (generalised Precision Time Protocol, IEEE \
802.1AS) utilities for AMD Xilinx TSN endpoints."
DESCRIPTION = "TSN user space gptp utilities"
SECTION = "gptp"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b3e2a6e620763288bcbc3190f6cb1704"

BRANCH = "master"
SRC_URI = "git://github.com/Avnu/gptp.git;branch=${BRANCH};protocol=https"
SRCREV = "0baef8a36a13105112862919aac0f1eed21a44ea"

inherit cmake pkgconfig

# Workaround for CMakelists.txt
EXTRA_OECMAKE += "-DCMAKE_POLICY_VERSION_MINIMUM=3.5"

DEPENDS = "cmake-native doxygen-native"

do_install () {
	install -d ${D}${sbindir}
	install -m 755 ${B}/gptp ${D}${sbindir}/
}
