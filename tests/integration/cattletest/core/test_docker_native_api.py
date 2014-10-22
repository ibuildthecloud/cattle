from common_fixtures import *  # NOQA

import re
import subprocess


@pytest.fixture(scope='session')
def docker_url():
    return 'tcp://localhost:8080'


def test_docker_create(docker_url):
    output = subprocess.check_output(['docker', '-H', docker_url, 'create',
                                      'ubuntu']).strip()

    assert re.match(r'[-a-z0-9]+', output)
