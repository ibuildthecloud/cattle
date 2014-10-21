from cattle import from_env

#URL = 'http://two:8080/v1/schemas'
URL = 'http://x-mgmt1:8080/v1'

client = from_env(url=URL)

did_something = True

while did_something:
    did_something = False
    for c in client.list_container(removed_null=True):
        if c.name != 'Agent':
            did_something = True
            print 'Deleting', c.name, c.id
            client.delete(c)