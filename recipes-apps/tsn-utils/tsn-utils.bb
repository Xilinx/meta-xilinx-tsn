SUMMARY = "User-space miscellaneous utilities for configuring and \
introspecting AMD Xilinx Time-Sensitive Networking (TSN) endpoints."
DESCRIPTION = "TSN user space miscellaneous utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=44e6f1bcc9f4ca675262918839e8663a"

BRANCH = "main"
SRC_URI = "git://github.com/Xilinx/tsn-utils.git;branch=${BRANCH};protocol=https"
SRCREV = "5e3f757872a60973e38eb3374f08e81b2b708c9b"

# Fix missing declaration
SRC_URI += " \
	file://0001-tsn-apps-br_progs-Fix-implicit-declaration-of-close.patch \
	file://0001-pcp_prog-pcp_prog.c-Fix-FD-definition.patch \
	file://0001-ptptime-ptptime.c-Add-missing-declarations-and-fix-r.patch \
	"

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf bash"

do_install() {
        oe_runmake install DESTDIR=${D}
}
