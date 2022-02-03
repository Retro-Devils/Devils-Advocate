.class Lcom/digdroid/alman/dig/q2$j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->y3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:[Z

.field final synthetic d:[Ljava/lang/String;

.field final synthetic e:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;I[Z[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$j0;->e:Lcom/digdroid/alman/dig/q2;

    iput p2, p0, Lcom/digdroid/alman/dig/q2$j0;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/q2$j0;->c:[Z

    iput-object p4, p0, Lcom/digdroid/alman/dig/q2$j0;->d:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$j0;->e:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p1, p2, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p2, 0x7f11008b

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/q2$j0$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/q2$j0$a;-><init>(Lcom/digdroid/alman/dig/q2$j0;)V

    const v0, 0x7f1101d8

    invoke-virtual {p1, v0, p2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
