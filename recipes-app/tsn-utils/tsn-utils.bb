DESCRIPTION = "TSN user space miscellaneous utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d4726d3931414cd9c75119a96a1151da"

BRANCH = "main"
SRC_URI = "git://github.com/Xilinx/tsn-utils.git;branch=${BRANCH};protocol=https"
SRCREV = "249e46bc83d68dde2a1189bdc1a384064cbe6edf"

S = "${WORKDIR}/git"

inherit autotools-brokensep

DEPENDS = "libconfig"
RDEPENDS:${PN} += "python3-libconf"
