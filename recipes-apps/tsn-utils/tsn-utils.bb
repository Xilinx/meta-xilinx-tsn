DESCRIPTION = "TSN user space miscellaneous utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=44e6f1bcc9f4ca675262918839e8663a"

BRANCH = "main"
SRC_URI = "git://github.com/Xilinx/tsn-utils.git;branch=${BRANCH};protocol=https"
SRCREV = "31eda804ace1aa896ce408124caed7ee6433532c"

S = "${WORKDIR}/git"

inherit autotools-brokensep

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf bash"
