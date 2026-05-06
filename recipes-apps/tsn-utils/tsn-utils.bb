SUMMARY = "User-space miscellaneous utilities for configuring and \
introspecting AMD Xilinx Time-Sensitive Networking (TSN) endpoints."
DESCRIPTION = "TSN user space miscellaneous utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=44e6f1bcc9f4ca675262918839e8663a"

BRANCH = "main"
SRC_URI = "git://github.com/Xilinx/tsn-utils.git;branch=${BRANCH};protocol=https"
SRCREV = "5e3f757872a60973e38eb3374f08e81b2b708c9b"

S = "${WORKDIR}/git"

inherit autotools-brokensep

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf bash"
