.class Lcom/digdroid/alman/dig/q2$j0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$j0;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2$j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$j0$a;->b:Lcom/digdroid/alman/dig/q2$j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$j0$a;->b:Lcom/digdroid/alman/dig/q2$j0;

    iget v1, v0, Lcom/digdroid/alman/dig/q2$j0;->b:I

    if-ge p1, v1, :cond_1

    iget-object v1, v0, Lcom/digdroid/alman/dig/q2$j0;->c:[Z

    aget-boolean v1, v1, p1

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/digdroid/alman/dig/q2$j0;->e:Lcom/digdroid/alman/dig/q2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "storage_dir"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$j0$a;->b:Lcom/digdroid/alman/dig/q2$j0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/q2$j0;->d:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, p2, v1}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    move p2, v2

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, v0, Lcom/digdroid/alman/dig/q2$j0;->e:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v0, "num_storage_dirs"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/b3;->x(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$j0$a;->b:Lcom/digdroid/alman/dig/q2$j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$j0;->e:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/q2;->y3()V

    return-void
.end method
