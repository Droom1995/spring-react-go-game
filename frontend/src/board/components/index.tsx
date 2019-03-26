import * as React from 'react';
import { WithStyles, withStyles } from '@material-ui/core/styles';
import {styles} from './styles';

// TODO move the message block to a separate component
const Board = (props: WithStyles<any>) => {
    return (
        <div className={props.classes.container}>

        </div>
    )
};
  
export default withStyles(styles)(Board);
