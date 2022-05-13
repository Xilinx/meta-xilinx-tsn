DESCRIPTION = "TSN talker listner examples"
LICENSE = "MIT & BSD & GPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.md;md5=d4726d3931414cd9c75119a96a1151da \
	file://OpenAvnu/README.rst;beginline=41;endline=58;md5=421b581669f30d492238ab13a0b86cbd \
"

BRANCH = "main"
SRC_URI = " \
	gitsm://github.com/Xilinx/tsn-talker-listener.git;branch=${BRANCH};protocol=https \
	file://0001-openavb_tasks-Add-missing-include-file.patch \
"
SRCREV = "8aee028a7be885679c04a954d0656a1b3d640a60"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_configure[noexec] = '1'

do_install () {
 	install -d ${D}${sbindir}
	install -m 755 ${S}/tsn_talker/tsn_talker ${D}${sbindir}
	install -m 755 ${S}/tsn_listener/tsn_listener ${D}${sbindir}
}
