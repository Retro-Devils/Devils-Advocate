.class Lcom/digdroid/alman/dig/v3$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->w1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:[Z

.field final synthetic d:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;I[Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$n;->d:Lcom/digdroid/alman/dig/v3;

    iput p2, p0, Lcom/digdroid/alman/dig/v3$n;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/v3$n;->c:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/digdroid/alman/dig/v3$n;->b:I

    if-ge p2, v1, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/v3$n;->c:[Z

    aget-boolean v1, v1, p2

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    if-eqz v0, :cond_3

    :goto_1
    iget v0, p0, Lcom/digdroid/alman/dig/v3$n;->b:I

    if-ge p1, v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$n;->d:Lcom/digdroid/alman/dig/v3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/v3;->i0:[Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/v3$n;->c:[Z

    aget-boolean v2, v2, p1

    aput-boolean v2, v1, p1

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "icon_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/digdroid/alman/dig/v3;->b0:[Ljava/lang/String;

    aget-object v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_enabled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/v3$n;->c:[Z

    aget-boolean v2, v2, p1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$n;->d:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/v3;->v(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$n;->d:Lcom/digdroid/alman/dig/v3;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f11011f

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101da

    invoke-virtual {p1, v0, p2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :goto_2
    return-void
.end method
