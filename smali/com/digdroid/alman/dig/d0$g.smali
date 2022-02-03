.class Lcom/digdroid/alman/dig/d0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->B(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/b;

.field final synthetic b:[Z

.field final synthetic c:[I

.field final synthetic d:I

.field final synthetic e:Lcom/digdroid/alman/dig/d0$t;

.field final synthetic f:Landroid/app/Activity;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Landroidx/appcompat/app/b;[Z[IILcom/digdroid/alman/dig/d0$t;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->h:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$g;->a:Landroidx/appcompat/app/b;

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$g;->b:[Z

    iput-object p4, p0, Lcom/digdroid/alman/dig/d0$g;->c:[I

    iput p5, p0, Lcom/digdroid/alman/dig/d0$g;->d:I

    iput-object p6, p0, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0$t;

    iput-object p7, p0, Lcom/digdroid/alman/dig/d0$g;->f:Landroid/app/Activity;

    iput-object p8, p0, Lcom/digdroid/alman/dig/d0$g;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->a:Landroidx/appcompat/app/b;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/d0$g$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/d0$g$a;-><init>(Lcom/digdroid/alman/dig/d0$g;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->a:Landroidx/appcompat/app/b;

    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/d0$g$b;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/d0$g$b;-><init>(Lcom/digdroid/alman/dig/d0$g;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
