.class Lcom/digdroid/alman/dig/f3$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Z

.field final synthetic b:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;[Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$q;->b:Lcom/digdroid/alman/dig/f3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f3$q;->a:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;IZ)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$q;->a:[Z

    aput-boolean p3, p1, p2

    return-void
.end method
