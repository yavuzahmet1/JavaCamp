import React from 'react'
import { Dropdown, DropdownItem, Menu, Image } from 'semantic-ui-react'

export default function SignedIn(props) {
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced="right" src="https://www.freepik.com/free-vector/find-person-job-opportunity_8063764.htm#query=avatar&position=1&from_view=keyword&track=sph" />
                <Dropdown pointing="top left" text='Ahmet'>
                    <Dropdown.Menu>
                        <Dropdown.Item text="Bilgilerim" icon="info" />
                        <Dropdown.Item onClick={props.signOut} text="Çıkış Yap" icon="sign-out" />
                    </Dropdown.Menu>
                </Dropdown>
            </Menu.Item>
        </div >
    )
}
