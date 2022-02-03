.class Lcom/digdroid/alman/dig/j0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->e3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Z

.field final synthetic c:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;[Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$h;->c:Lcom/digdroid/alman/dig/j0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/j0$h;->b:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    const/4 p1, 0x0

    :goto_0
    sget-object p2, Lcom/digdroid/alman/dig/j0;->p0:[Ljava/lang/String;

    array-length v0, p2

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$h;->c:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    aget-object p2, p2, p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$h;->b:[Z

    aget-boolean v1, v1, p1

    invoke-virtual {v0, p2, v1}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$h;->c:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/j0;->N2()V

    return-void
.end method
