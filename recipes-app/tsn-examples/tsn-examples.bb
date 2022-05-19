DESCRIPTION = "TSN talker listner examples"
LICENSE = "LGPL-2.1 & BSD & GPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.md;md5=1750b1f4467832c066d5199bae61de06 \
	file://OpenAvnu/README.rst;beginline=41;endline=58;md5=421b581669f30d492238ab13a0b86cbd \
"

BRANCH = "main"
SRC_URI = " \
	gitsm://github.com/Xilinx/tsn-talker-listener.git;branch=${BRANCH};protocol=https \
	file://0001-openavb_tasks-Add-missing-include-file.patch \
"
SRCREV = "75e9e55a3d10c59283844f1f9fb0454ed8c64867"

S = "${WORKDIR}/git"

inherit autotools-brokensep

do_configure[noexec] = '1'
