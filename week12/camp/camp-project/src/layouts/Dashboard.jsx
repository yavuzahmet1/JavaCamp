import React from 'react'
import Categories from './Categories'
import ProductList from '../pages/ProductList'
import { Grid } from 'semantic-ui-react'
import { Route } from 'react-router-dom';



export default function Dashboard() {
  return (
    <div>
      <Grid >
        <Grid.Row>
          <Grid.Column width={4}>
            <Categories />
          </Grid.Column>
          <Grid.Column width={12}>
            <Route path="/" component={ProductList}/>
          </Grid.Column>
        </Grid.Row>
      </Grid>
    </div>
  );
}
